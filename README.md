# Spring-Boot-App
Ceci est un projet java en utilisant le framework Spring boot, réalisé dans le cadre du cours POO API &amp; Outillage à l'ENSIM


***Etape 5 : Dépendances***

1- Web : Framework permettant de créer des application web en facilitant les configurations nécessaires.

2- JPA : Java Persistance API, une collection de classe permettant de gérer la persistance de données, et proposant notamment l'ORM; Object Relational Mapping.

3- Hibernate : Framework offrant une implémentation du standard JPA , offrant une implementation indépendante du type de la base de données.

4- H2 : C'est une Databse in Memory, c'est à dire réinitialisée à chaque redemarrage de l'application, utilisée principalement pour les tests.

5- DevTools : C'est une partie du framework Spring Boot, permettant d'améliorer l'experience de développement, en offrant des fonctionnalités tel que le liveReload.

6- TimeLeaf : Un template du java engine pour le web, capable de traiter des fichier HTML, XML, JS, CSS & PlainText. Utilisé principalement pour générer des HTML pour les applications Web.



***Etape 13 : Contrôlleur***


1- Le paramétrage de l'URL est effectué à l'aide de l'annotation GetMapping.

2- Le fichier HTML à afficher est indiqué dans le retour de la méthode greeting.

3- Le paramètre "nom" est envoyé à partir du lien, en spécifiant la valeur du paramètre nameGet "http://localhost:8080/greeting **?nameGet=ENSIM** ".


***Etape 17 : BDD***

La différence étant que l'entité addresse s'affiche dans la barre d'outils.


***Etape 20 : Résultat de la requête***

On constate le résultat de la requête de selection, ie: les données ajoutés au fichier data.sql


***Etape 30 : Ajout de Bootstrap***

L'ajout de Bootstrap a été fait en ajoutant les dépendances de bootstrap et jQuery sur le Pom.xml, puis l'ajout des stylesheet et scripts sur le fragment Header
