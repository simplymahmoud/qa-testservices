# testservices
Services for testing which will be consumed by the front end projects(web,iOS, Android, Api)

This projectis a provider for all other consuming projects in qa-automation.
It is a dependency which need to be included in the pom.xml's in these projects.

Example: 
       ```<dependency>
      <groupId>com.noon.test</groupId>
      <artifactId>testservices</artifactId>
      <version>1.0.0-SNAPSHOT</version>
      <scope>compile</scope>
      </dependency>```

The version will be increased by each push and needs to be updated in the consuming projects.
