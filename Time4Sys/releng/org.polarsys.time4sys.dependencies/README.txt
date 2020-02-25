How to update core.dependencies update site ?
---------------------------------------------

- Open analysisRepoDependencies.target in the Target Editor
- Reload
- In the content tab, select all plugins
- Export Target Platform to org.polarsys.time4sys.dependencies/exported_site
- Refresh org.polarsys.time4sys.dependencies and check that all plugins were exported
- Right-click on build-core-dependencies.xml and select Run As / Ant Build

=> The site directory is updated and can be commited.


