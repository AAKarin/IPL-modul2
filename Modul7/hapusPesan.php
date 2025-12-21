<?php
	$id = $_GET['id'];
	$conn = mysqli_connect("localhost","root","");
	mysqli_select_db("dbimpal", $conn);
	
	$sql = "delete from pesan where idPesan = $id";
	
	if(mysqli_query($sql, $conn)){
		header("location:LihatPesan.php");
	}else{
		echo "Gagal menghapus pesan";
	}
?>