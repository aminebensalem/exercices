<?php
session_start ();
$pas_de_valeur = 0;
require_once ('../connections/connections.php');
try {
	$bdd = new PDO ( 'mysql:host=localhost; dbname=dataBaseExo; charset=utf8', 'root', '' );
} catch ( Exception $e ) {
	die ( 'Erreur : ' . $e->getMessage () );
}
$response = $bdd->query ( 'SELECT id FROM dataBaseExo' )?>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-UTF8">
		<title>Exercice</title>
	</head>
	<body>
		<h1>test</h1>	
		<p><?php echo $pas_de_valeur?> </p>
	</body>
</html>
