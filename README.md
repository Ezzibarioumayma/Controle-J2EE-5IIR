# Controle-JEE-ALLAM-AOUATIF
<h1><i>1-L'Objectif de l'Atelier:</i><h1>
<h3>Créer une application basée sur une architecture micro-service qui permet de gérer les factures contenant des produits et appartenant à un client.</h3>
<ol>
  <li>Micro-service customer-service qui permet de gérer les client</li>
  <li>Micro-service inventory-service qui permet de gérer les produits</li>
  <li>Gateway Spring cloud Gateway avec une Configuration statique du système de routage</li>
  <li>Annuaire Eureka Discrovery Service</li>
  <li>Configuration dynamique des routes de la gateway</li>
  <li>Service de facturation Billing-Service en utilisant Open Feign</li>
  <li>Client Web Angular (Clients, Produits, Factures)</li>
  <li>Déployer le serveur keycloak :</li>
  <dl>
  <dt>- Créer un Realm</dt>
  <dt>- Créer un client à sécuriser</dt>
  <dt>- Créer des utilisateurs</dt>
  <dt>- Créer des rôles</dt>
  <dt>- Affecter les rôles aux utilisateurs</dt>
  <dt>- Tester les différents modes d'authentification avec Postman en montrant les contenus de Access-Token, Refresh Token</dt>
  </dl>
  <li>Sécuriser les micro-services et le frontend angular en déployant les adaptateurs Keycloak</li>
</ol>
<h1><i>2-La simulation :</i><h1>
<img src="https://user-images.githubusercontent.com/80590096/209091463-0fe25b5b-b8fe-4331-a200-0b466f0af665.PNG"/>
<img src="https://user-images.githubusercontent.com/80590096/209091588-0c40b8de-3c4d-466c-a334-74d1cd32cd69.PNG"/>  
<img src="https://user-images.githubusercontent.com/80590096/209092073-a368fc23-1777-4570-9764-2d584f1406a3.PNG"/>  
<img src="https://user-images.githubusercontent.com/80590096/209092256-7701818a-37c5-428d-b900-c5c16539141c.PNG"/>  
<img src="https://user-images.githubusercontent.com/80590096/209092280-93dda850-784c-4f6b-af2b-8b8ae3b986f0.PNG"/>  
<img src="https://user-images.githubusercontent.com/80590096/209092313-d013f233-633a-4758-938a-3662844d8216.PNG"/> 
<img src="https://user-images.githubusercontent.com/80590096/209092704-00b1f166-702e-42b9-b37f-21565e6e81ea.PNG"/>  
<h1><i>3-Partie Front (Angular) :</i><h1>
<ul>Liste des clients</ul>
<img src="https://user-images.githubusercontent.com/80590096/209116003-cf232ef6-101b-42df-9345-24611eab3d48.PNG">
<ul>Liste des produits</ul>
<img src="https://user-images.githubusercontent.com/80590096/209116024-e72c8391-6671-494f-9279-15a4d757c45d.PNG">
<ul>Details d'une facture d'un client</ul>
<img src="https://user-images.githubusercontent.com/80590096/209116954-7f01aac1-d872-4d83-81c8-b20a14ce40eb.PNG">


 
