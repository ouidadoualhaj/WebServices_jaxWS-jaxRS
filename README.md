# WebService_jaxWS-jaxRS
Objectif : L’objectif principal de cet atelier et de pratiquer la mise en place d’une variété des web services basés sur plusieurs architectures. Durant cet atelier l’étudiant sera mené à implémenter 3 architectures spécifiques: JAX-WS, JAX-RS, Jersey, le rôle principal de ces web services est de garantir la bonne gestion des stations et prix des

![image](https://user-images.githubusercontent.com/97354112/207429569-aa22e478-b86d-4764-807c-903a73ede33c.png)

Outils : Eclipse, Maven, Tomcate, JAX-WS, JAX-RS.

Partie 1 : Mise en place des Web Services :

Digramme de class :

![image](https://user-images.githubusercontent.com/97354112/207429619-361a3d90-a255-45fc-b433-588b8eedc364.png)

Traduisez ce digramme de class en schéma BDD pour la SGBD MySQL, puis implémentez la couche persistance en se basant sur l’API JPA.

![image](https://user-images.githubusercontent.com/97354112/207429674-d506a9e2-0d69-465d-8696-6d068491267f.png)

la base de données est generée automatiquement graçe au persistence (jpa) en exécutant la classe de test :

![image](https://user-images.githubusercontent.com/97354112/207429734-6c16c8df-ebdd-486f-aa18-79816bca89cf.png)

le résultat au niveau de PhpMyAdmin:

![image](https://user-images.githubusercontent.com/97354112/207429772-b9104353-66be-4bcf-8ce0-07455cf169c8.png)

![image](https://user-images.githubusercontent.com/97354112/207429785-52d71a32-6f96-4c77-adf9-3db2ac4565a8.png)

Implémentez des méthodes pour un web service qui va gérer la partie backend « CRUD station, CRUD Carburant, et la gestion des prix journaliers du carburant d’une station donnée ». ce web service sera de type JAX-WS.

il faut ajouter la dépendance suivante au niveau du fichier pom.xml pour qu'on peut créer des service jax-ws :

![image](https://user-images.githubusercontent.com/97354112/207429857-bcf3babb-52ca-481c-bdc7-9b5989ea8a3c.png)

maintenant on peut utiliser les annotations @WebService, @SOAPBinding et @WebMethod pour implémenter les méthodes au niveau des interfaces !

![image](https://user-images.githubusercontent.com/97354112/207429889-1f1469d8-aaa9-46f0-a070-5343fb4462d3.png)

Finalement Testez ces différents web services en utilisant le navigateur web.

la classe WsPublisher est pour déployer le web service !

