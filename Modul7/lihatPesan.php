<!DOCTYPE html>
<html>
<head>
	<title>Lihat Pesan</title>
</head>
<body>
	<h2>Daftar Pesan</h2>
	<a href="Form_TambahPesan.php">+ Tambah Pesan</a>
	<br><br>
	<table border="1" cellpadding="5" cellspacing="0">
		<thead>
			<tr>
				<th>No</th>
				<th>Pengirim</th>
				<th>Penerima</th>
				<th>Judul</th>
				<th>Isi Pesan</th>
				<th>Tanggal</th>
				<th>Aksi</th>
			</tr>
		</thead>
		<tbody>
			<?php
			$conn = mysqli_connect("localhost","root","");
			mysqli_select_db("dbimpal", $conn);
			
			$sql = "select * from pesan";
			$result = mysqli_query($sql, $conn);
			$no = 1;
			
			while($row = mysqli_fetch_array($result)){
				echo "<tr>";
				echo "<td>".$no."</td>";
				echo "<td>".$row['idPengirim']."</td>";
				echo "<td>".$row['idPenerima']."</td>";
				echo "<td>".$row['judul']."</td>";
				echo "<td>".$row['TextPesan']."</td>";
				echo "<td>".$row['tanggal']."</td>";
				echo "<td><a href='hapusPesan.php?id=".$row['idPesan']."'>Hapus</a></td>";
				echo "</tr>";
				$no++;
			}
			?>
		</tbody>
	</table>
</body>
</html>