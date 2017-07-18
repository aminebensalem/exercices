<?php
function testParam($_GET['id'])
{
if (isset($_GET['id']))
{
	return echo $_GET['id'];
}
else
{
	return echo 'Veuillez passer en parametre l"id de la page voulue (1,2,3)';
}
}


$servername="localhost";
$username="root";
$password="root";
$dbname="data";

try
{
	//connection avec Mysql
	$bdd= new PDO('mysql:host=$servername;dbname=$dbname;charset=utf8','$username','$password')
}
catch(Exceprion $e)
{
	die('Erreur : '.$e->getMessage());
}

$reponse=$bdd -> query('SELECT text FROM data.bd WHERE id= \'$_GET['id']\'');

while($donnees = $reponse->fetch())
{
	echo $donnees['text'];
}
?>


<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
 		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=0.5">
 		<link rel="stylesheet" href="css/bootstrap.min.css">
		<title>Index</title>
	</head>
	<body>
		<nav>
			<ul class="nav nav-pills nav-tabs nav-stacked nav-justified">
				<li><a href="index.php&amp;id=1">Acceuil</a></li>
                <li><a href="index.php&amp;id=2">Page 1</a></li>
                <li><a href="index.php&amp;id=3">Page 2</a></li>				
			</ul>
		</nav>
		<p> <?php echo $donnees['text']; ?> 
	</body>
</html>