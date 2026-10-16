/**
 * Copyright (c) 2026 Talaxie.
 * 
 * This program and the accompanying materials
 * are made available under the terms of the Apache v2 License
 * which accompanies this distribution, and is available at
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.talend.core;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Optional;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.function.Function;
import java.util.function.Supplier;

import org.apache.felix.service.command.CommandSession;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.talend.commons.CommonsPlugin;
import org.talend.core.runtime.CoreRuntimePlugin;

/**
 * Gogo command service to provide answers to CLI questions. This service is
 * registered only in headless mode.
 */
public class CLIAnswersBridgeService {

	/**
	 * Service command name for answering questions. Users can type "a my-answer" in
	 * the Gogo shell to provide an answer.
	 */
	public static final String SERVICE_COMMAND_NAME = "a";

	/**
	 * Singleton holder for the CLIAnswersBridgeService instance.
	 */
	public static final class SingletonHolder {
		private static final CLIAnswersBridgeService INSTANCE = new CLIAnswersBridgeService();
	}

	/**
	 * Blocking queue to hold the answers provided by the user.
	 */
	private final BlockingQueue<String> answers = new SynchronousQueue<>();
	/** Whether service is registered. */
	private boolean registered = false;

	/**
	 * Private constructor.
	 */
	private CLIAnswersBridgeService() {
		/*
		 * Register the service now, not in activator, because the plugin may not known
		 * the application is headless at startup time.
		 */
		if (CommonsPlugin.isHeadless()) {
			// Register the service in the OSGi context
			BundleContext context = CoreRuntimePlugin.getInstance().getBundle().getBundleContext();
			Hashtable<String, Object> props = new Hashtable<>();
			props.put("osgi.command.scope", "cli");// cli:a
			props.put("osgi.command.function", new String[] { SERVICE_COMMAND_NAME });
			ServiceRegistration<CLIAnswersBridgeService> gogoRegistration = context
					.registerService(CLIAnswersBridgeService.class, this, props);
			CoreRuntimePlugin.getInstance().addOnStopListener(gogoRegistration::unregister);
			registered = true;
		}
	}

	/**
	 * Gets the singleton instance of this service.
	 * 
	 * @return the singleton instance
	 */
	public static CLIAnswersBridgeService getInstance() {
		return SingletonHolder.INSTANCE;
	}

	/**
	 * Answers the CLI question by putting the answer into the blocking queue.
	 * <p>
	 * Invoked by Gogo when user types "a my-answer".
	 * </p>
	 * 
	 * @param session command session
	 * @param answer  the answer to the question
	 * @throws IOException
	 */
	public void a(CommandSession session, String answer) throws IOException {
		try {
			answers.put(answer); // blocking, until askUser() takes it
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

	/**
	 * Asks the user a simple prompt with a string answer (no validation, nor
	 * feedback).
	 * 
	 * @param prompt the question to ask (taking in account the
	 *               {@link CLIAnswersBridgeService#SERVICE_COMMAND_NAME} prefix).
	 * @return the answer provided by the user.
	 * @throws InterruptedException if the thread is interrupted while waiting for
	 *                              user input.
	 */
	public String askUser(String prompt) throws InterruptedException {
		if (!registered) {
			throw new InterruptedException("CLIAnswersBridgeService can only be used when headless mode is activated.");
		}
		System.out.println(prompt);
		return answers.take(); // blocking, awaken by put()
	}

	/**
	 * Prompt the user with the given message and return their answer.
	 * 
	 * @param prompt               The message to display to the user.
	 * @param validator            A function to transform and validate the user's
	 *                             input. Return an Optional containing the
	 *                             transformed value if valid, or empty if invalid.
	 * @param invalidAnswerMessage A supplier that provides a message to display if
	 *                             the user's input is invalid.
	 * @return An Optional containing the user's response if valid, or empty if
	 *         invalid.
	 */
	public <E> Optional<E> promptUser(String prompt, Function<String, Optional<E>> validator,
			Supplier<String> invalidAnswerMessage) {
		try {
			String answer = askUser(prompt);
			Optional<E> validatedAnswer = validator.apply(answer);
			if (validatedAnswer.isPresent()) {
				return validatedAnswer;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Optional.ofNullable(invalidAnswerMessage.get()).ifPresent(System.out::println);
		return Optional.empty();
	}
}
