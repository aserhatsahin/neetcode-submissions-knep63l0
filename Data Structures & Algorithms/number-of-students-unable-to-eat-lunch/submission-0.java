class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        //square 0
        // circular 1
        //# of sandwiches = # of students 
        //sandwiches in a stack 
        //students in a Queue

        // studentin tercihi sandwiuchle eslesiyorsa quedan cikar eslesmiorsa queudan yiyne poplayip sonra ekle 
        // sandwichler eslesmiyorsa ayni eslesiyorsa stackten cikar /
        // stack veyyya queue bos olana kadar yhyap 
        // eat olarak yenilenleri say ve returnle

        int res = students.length;
        HashMap<Integer,Integer> stuCnt = new HashMap<Integer,Integer>();

        stuCnt.put(0, 0);
        stuCnt.put(1, 0);
        for(int s : students){
            if(s==0) {
                stuCnt.put(0,stuCnt.get(0)+1);
            }
            else{

                stuCnt.put(1,stuCnt.get(1)+1);
            }

        }

        for(int sn : sandwiches){
            if(stuCnt.get(sn) > 0){
                    res--;
                      stuCnt.put(sn,stuCnt.get(sn)-1);

            }
            else return res;
    
        
        }

        return res;

        
    





    }
}   