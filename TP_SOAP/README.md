Ce projet se décompose en trois sous-projets maven :

TP_SOAP_Hotel : qui contient les servers de deux hotels, ainsi que les services et le modèle de données.

TP_SOAP_Agence : qui contient le server d'une agence, ainsi que les services et le modèle de données.

CLI : qui contient l'interface avec laquelle l'utilisateur va interagir (dans notre cas un terminal).

Afin que le projet fonctionne correctement, il faudrait lancer les servers des deux hotels puis celui de l'agence et enfin celui du CLI.

Remarque : Le projet CLI doit contenir les wsdl de TP_SOAP_Agence et TP_SOAP_Agence doit à son tour contenir les wsdl de TP_SOAP_Hotel. Ces wsdl ont été déjà générés et mis dans les projets en question, il n'est donc pas nécessaire de les regénérer.
