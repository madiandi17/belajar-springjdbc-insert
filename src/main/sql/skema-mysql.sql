DROP TABLE IF EXISTS produk;

CREATE TABLE produk (
  id int(11) NOT NULL AUTO_INCREMENT,
  kode varchar(15) NOT NULL,
  nama varchar(45) NOT NULL,
  harga decimal(19,2) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--- test insert data
Produk p = new Produk();
p.setKode("P-001");
p.setNama("Produk 001");
p.setHarga(new BigDecimal(100000.00));
        
pd.simpan(p);
System.out.println("id : " + p.getId());
