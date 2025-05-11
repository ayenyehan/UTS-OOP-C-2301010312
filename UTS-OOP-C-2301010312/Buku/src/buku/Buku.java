package buku;

/**
 *
 * @author Grace Maya
 */
public class Buku {
       private String kodeBuku;
    private String judul;
    private String penulis;

    // Constructor default (overloading)
    public Buku() {
        this.kodeBuku = "";
        this.judul = "";
        this.penulis = "";
    }

    // Constructor dengan parameter
    public Buku(String kodeBuku, String judul, String penulis) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.penulis = penulis;
    }

    // Getter dan Setter
    public String getKodeBuku() {
        return kodeBuku;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    @Override
    public String toString() {
        return "Kode: " + kodeBuku + ", Judul: " + judul + ", Penulis: " + penulis;
    }
  
    
}
