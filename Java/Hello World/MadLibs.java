public class MadLibs {
    /*
    This program generates a mad libbed story.
    Author: Cole
    Date: 08/29/22
    */
    public static void main(String[] args){
        String name1 = "Cole";
        String adjective1 = "cool";
        String adjective2 = "funny";
        String adjective3 = "hot";
        String verb1 = "run";
        String noun1 = "black nun";
        String noun2 = "ice";
        String noun3 = "cars";
        String noun4 = "movies";
        String noun5 = "universe";
        String noun6 = "day";
        String name2 = "Hasanabi";
        int number = 1;
        String place1 = "West Hollywood";



        //The template for the story
        String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

        System.out.println(story);
    }
}
