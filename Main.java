public class Main{
	public static void main(String[] v){
		tumbuhan tumbuh = new tumbuhan(v[0], v[1], v[2], v[3], v[4], v[5], v[6], v[7], v[8], v[9], v[10], v[11], v[12], v[13]);
	
	String nama = tumbuh.getNama();
	String namalatin = tumbuh.getNamalatin();
	String daun = tumbuh.getDaun();
	String batang = tumbuh.getBatang();
	String akar = tumbuh.getAkar();
	String bunga = tumbuh.getBunga();
	String buah = tumbuh.getBuah();
	String kingdom = tumbuh.getKingdom();
	String divisi = tumbuh.getDivisi();
	String kelas = tumbuh.getKelas();
	String ordo = tumbuh.getOrdo();
	String famili = tumbuh.getFamili();
	String genus = tumbuh.getGenus();
	String spesies = tumbuh.getSpesies();
	
	System.out.println(nama);
	System.out.println(namalatin);
	System.out.println(daun);
	System.out.println(batang);
	System.out.println(akar);
	System.out.println(bunga);
	System.out.println(buah);
	System.out.println(kingdom);
	System.out.println(divisi);
	System.out.println(kelas);
	System.out.println(ordo);
	System.out.println(famili);
	System.out.println(genus);
	System.out.println(spesies);
	}
}