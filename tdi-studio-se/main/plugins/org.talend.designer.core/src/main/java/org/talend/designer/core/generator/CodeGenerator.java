package org.talend.designer.core.generator;

import java.util.function.Consumer;
import java.util.function.Supplier;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.core.model.process.IProcess;
import org.talend.core.model.repository.IRepositoryObject;
import org.talend.designer.runprocess.IProcessor;
import org.talend.designer.runprocess.ProcessorException;
import org.talend.designer.runprocess.ProcessorUtilities;

/**
 * A job to generate code for a given process.
 */
public class CodeGenerator extends Job {

	/** Provides the process for which to generate code */
	private Supplier<IProcess> processSupplier;
	/** Synchronize access during code generation (e.g. on SWT Display) */
	private Consumer<Runnable> lock = Runnable::run;
	/** Provides the processor to use for code generation */
	private Supplier<IProcessor> processorSupplier = () -> {
		// create a processor for the process to generate code
		var process = processSupplier.get();
		var property = (process instanceof IRepositoryObject r) ? r.getProperty() : null;
		return ProcessorUtilities.getProcessor(process, property, process.getContextManager().getDefaultContext());
	};

	/**
	 * Creates a new code generator job.
	 * 
	 * @param processSupplier a supplier that provides the process for which to
	 *                        generate code
	 */
	public CodeGenerator(Supplier<IProcess> processSupplier) {
		this(processSupplier, Runnable::run);
	}

	/**
	 * Creates a new code generator job.
	 * 
	 * @param processSupplier a supplier that provides the process for which to
	 *                        generate code
	 * @param lock            a lock object to synchronize access (e.g. on SWT
	 *                        Display) during code generation
	 */
	public CodeGenerator(Supplier<IProcess> processSupplier, Consumer<Runnable> lock) {
		super("Generating code");
		this.processSupplier = processSupplier;
		this.lock = lock;
		setUser(false);
		setPriority(Job.INTERACTIVE);
	}

	/**
	 * Sets the lock object to synchronize access (e.g. on SWT Display) during code
	 * generation.
	 * 
	 * @param lock a lock object executing the generation runnable
	 * @return this code generator for chaining
	 */
	public CodeGenerator withLock(Consumer<Runnable> lock) {
		this.lock = lock;
		return this;
	}

	/**
	 * Sets the processor supplier to use for code generation.
	 * 
	 * @param processorSupplier a supplier that provides the processor to use
	 * @return this code generator for chaining
	 */
	public CodeGenerator withProcessorSupplier(Supplier<IProcessor> processorSupplier) {
		this.processorSupplier = processorSupplier;
		return this;
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		var process = processSupplier.get();
		if (process == null) {
			return Status.error("Process not found for code generation.");
		}
		var processor = ProcessorUtilities.getProcessor(process, null, process.getContextManager().getDefaultContext());
		boolean codeGenerated = processor.isCodeGenerated();
		lock.accept(() -> {
			try {
				monitor.beginTask("Generating code", IProgressMonitor.UNKNOWN);
				boolean lastGeneratedWithStats = ProcessorUtilities.getLastGeneratedWithStats(process.getId());
				boolean lastGeneratedWithTrace = ProcessorUtilities.getLastGeneratedWithTrace(process.getId());

				int option = codeGenerated ? ProcessorUtilities.GENERATE_MAIN_ONLY
						: ProcessorUtilities.GENERATE_WITH_FIRST_CHILD;
				ProcessorUtilities.generateCode(process, process.getContextManager().getDefaultContext(),
						lastGeneratedWithStats, lastGeneratedWithTrace, true, option, monitor);
			} catch (ProcessorException e) {
				ExceptionHandler.process(e);
			}
		});
		return Status.OK_STATUS;
	}

}
