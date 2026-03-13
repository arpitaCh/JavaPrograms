import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * The School of Languages and Science offers five subjects: Physics, Chemistry, Math, Botany, and Zoology. Each student is proficient in one subject. The students' skills are represented by a string of characters, with each character being one of the following: p, c, m, b,
 * or z, indicating their respective skills.
 * Python 3
 * Given a list of students' skills, calculate the total number of possible teams that meet the following conditions:
 * • A team must consist of exactly five students.
 * • Each student on the team must be proficient in a different subject.
 * • A student can only be part of one team.
 * Example 1
 * skills = pcmbzpcmbz
 * Loading
 * There are 2 possible teams that can be formed at one time: skills[0-
 * 4] = pcmbz and skills[5-9] = pcmbz, for example.
 * Example 2
 * skills = mppzbmbpzcbmpbmczcz
 * The sorted string is bbbbcccmmmmppppzzzz. All of the skills are represented, but only 3 students are skilled in Chemistry. Only 3
 * teams can be created.
 * Function Description
 * Complete the function differentTeams in the editor with the
 * following parameter(s):
 * string skills: a string of length n, where each position represents
 * the skill of a student
 */

public class FivetranQuestion2 {

    public static void main(String[] str){

        String skills1 ="mppbmbpczbmpzbmccz";
        teamFormationCount(skills1);
    }

    private static void teamFormationCount(String skills) {

//        char[] ch = skill.toCharArray();
//        int teamCount =0;
//        Set<Character> set = new HashSet<>();
//
//        for(int i=0 ; i< skill.length(); i++){
//        if(skill.charAt(i) =='p' || skill.charAt(i) =='c' || skill.charAt(i) =='m' || skill.charAt(i) =='b' ||skill.charAt(i) =='z' ){
//            set.add(skill.charAt(i));
//            if(set.size() == 5){
//
//                teamCount++;
//                set.clear();
//            }
//        }
//
//
//        }
//        System.out.println(" team count is "+ teamCount);
        Map<Character, Integer> skillCount = new HashMap<>();
        for( char skill : skills.toCharArray()){
            if(skill =='p' || skill =='c' || skill =='m' || skill =='b' || skill =='z' ){
                skillCount.put(skill, skillCount.getOrDefault(skill,0)+1);

            }
        }

        for(Map.Entry<Character,Integer> entry : skillCount.entrySet()){
            System.out.println(" skill is "+ entry.getKey() + " count is "+ entry.getValue());
        }

        int teamCount = Integer.MAX_VALUE;
        if(skillCount.keySet().contains('p') && skillCount.keySet().contains('c') && skillCount.keySet().contains('m') && skillCount.keySet().contains('z') && skillCount.keySet().contains('b')) {

            for (Map.Entry<Character, Integer> entry : skillCount.entrySet()) {
                if (entry.getValue() < teamCount) {
                    teamCount = entry.getValue();
                }
            }
        }
            else{
                teamCount=0;
                System.out.println(" not all skills are present");
            }


        System.out.println(" total team count is "+ teamCount);
    }
}
