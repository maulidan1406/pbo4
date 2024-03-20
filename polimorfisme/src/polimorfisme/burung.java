public class burung extends hewan {
 
    // Menggunakan method dari kelas induk abstrak
    @Override
    protected void munculSuara() {
        System.out.println("Suara Burung: Cit...cit..cit.");
    }
 
}