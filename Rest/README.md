Ce projet se décompose en trois applications Spring Boot maven :

hotelServiceAcapulco, hotelServiceIbis : qui contiennet les servers des deux hotels, ainsi que les services et le modèle de données.

agenceService, agenceService2 : qui contiennet les servers des agences, ainsi que les services et le modèle de données.

comparateur : qui contient les différentes agences partenaires ainsi que  l'interface avec laquelle l'utilisateur va interagir (dans notre cas un terminal).

Première partie(client consulte l'agence directement)
	Afin que le projet fonctionne correctement, il faudrait lancer les servers des deux hotels puis celui des agences.

Deuxième partie(client fait appel à un comparateur)
	Afin que le projet fonctionne correctement, il faudrait lancer les servers des deux hotels puis celui des agences et enfin celui du comparateur.


Dans ce projet, nous avons pris comme exemples deux hotels de 2 étoiles dont un situé à Paris et l'autre à Montpellier. Afin de simuler correctement un réservation, il faudra chercher dans ces deux villes et mettre 2 étoiles afin d'avoir des résultats.

