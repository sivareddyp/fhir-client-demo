FHIR Client
---
---
This program fetches data from OpenMRS / Bahmni FHIR resources.

- JDK 17 or higher.
- REST client: Rest Template

Update application.properties with valid values before running the application

Output
-------
Make HTTP Call http://localhost:8080/api/v1/{resourceType}/{id}

- resourceType : FHIR resources such as Patient, Condition, Medication
- id : uuid of the corresponding resource

