import java.util.ArrayList;

class Playlist2 {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

    desertIslandPlaylist.add("Supersonic");
    desertIslandPlaylist.add("Wonderwall");
    desertIslandPlaylist.add("Shakermaker");
    desertIslandPlaylist.add("Champagne Supernova");
    desertIslandPlaylist.add("Live Forever");
    desertIslandPlaylist.add("Dont Look Back in Anger");
    desertIslandPlaylist.add("Lyla");
    desertIslandPlaylist.add("Columbia");

    // Printing playlist
    //System.out.println(desertIslandPlaylist);
    
    // Checking array length
    // System.out.println(desertIslandPlaylist.size());

    desertIslandPlaylist.remove("Shakermaker");
    desertIslandPlaylist.remove("Lyla");
    desertIslandPlaylist.remove("Columbia");

    int indexA = desertIslandPlaylist.indexOf("Champagne Supernover");
    int indexB = desertIslandPlaylist.indexOf("Supersonic");

    String tempA = "Champagne Supernova";

    desertIslandPlaylist.set(indexA, "Supersonic");
    desertIslandPlaylist.set(indexB, tempA);
    System.out.println(desertIslandPlaylist);
    
  }
  
}