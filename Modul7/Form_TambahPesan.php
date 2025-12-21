<!DOCTYPE html>
<html>
<head>
	<title>Tambah Pesan</title>
</head>
<body>
	<form action="simpanPesan.php" method="post">
		<!-- diasumsikan idPengirim = id user login, didapatkan dari session dan
		idpesan auto_increment dan tanggal adalah tanggal saat ini sehingga tidak
		perlu input -->
		<input type="text" name="Penerima" placeholder="Penerima">
		<input type="text" name="judul" placeholder="Judul Pesan">
		<textarea name="TextPesan" placeholder="Isi Pesan"></textarea>
		<input type="submit" name="submit" value="Simpan">
	</form>
</body>
</html>