<?php
	$idPengirim=$_SESSION['id'];
	$idPenerima=$_POST['Penerima'];
	$judul=$_POST['judul'];
	$TextPesan=$_POST['TextPesan'];
	$date = date('Y-m-d H:i:s');
	$conn = mysqli_connect("localhost","root","","dbimpal");
	$sql = "insert into pesan values('',$idPengirim,$idPenerima,$judul,$TextPesan,$date)";
	
	if($res = mysqli_query($conn,$sql)){
		echo "Pesan berhasil ditambahkan";
	}else{
		echo "Pesan gagal ditambahkan";
	}
?>