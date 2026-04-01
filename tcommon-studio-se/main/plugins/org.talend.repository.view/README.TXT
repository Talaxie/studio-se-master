This project adds a view called Repository View based on the Eclipse CNF (Common Navigator Framework).

Using CNF is very handy because anyone can add new items and even enrich our own tree items.
user can add content, filter, sorter, actions, wizard using extension points.
The job content provider is relying on the old legacy content provider.


There is also an implementation of a filter that is parametrized using Extension points. This filter only displays the content specified by the extension point according to the perspective.
This mean a single view (Instead of have differents view implementations) could be used between different perspective and the content displayed could be filtered according to the current perspective.


there is a bug that make use of the adapter complicated because they do not get loaded when used.
https://bugs.eclipse.org/bugs/show_bug.cgi?id=82973
So adapters need to be registered programatically usually in the plugin activator.
But for this the plugin needs to be started.
Here is a workaround.

create a dummy content provider definition based on a dummy property tester, in order to start the pluging and
register all the necessary adapters with a trigger point that will always be false.
the content provider id shall start with "org.talend.repository.view.content.dummy.for.activation"
here is the content provider defintion:
<navigatorContent
            activeByDefault="true"
            contentProvider="org.talend.repository.view.di.viewer.content.DummyContentProvider"
            id="org.talend.repository.view.content.dummy.for.activation.di"
            name="name">
         <enablement>
            <and>
               <instanceof
                     value="org.talend.repository.navigator.TalendRepositoryRoot">
               </instanceof>
               <test
                     forcePluginActivation="true" <!-- this is what make the plugin to get started and there for activator called if adapter need to be registered -->
                     property="org.talend.repository.node.alwaysFalse">
               </test>
            </and>
         </enablement>
</navigatorContent>
      
      and here is the property tester definition, the class must be in the plugin that needs to be started
      and manifest needs this line (Bundle-ActivationPolicy: lazy)
      <propertyTester
            class="org.talend.repository.tester.NodeTester"
            id="org.talend.repository.view.di.activation.tester"
            namespace="org.talend.repository.node"
            properties="alwaysFalse"
            type="org.talend.repository.navigator.TalendRepositoryRoot">
      </propertyTester>

      