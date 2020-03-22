public static int  getMid(int [] arr){
        if(arr.length == 0)
            return 0;
        else
            return (arr[arr.length % 2 + 1] );
        
    } 
    
    //1.Centered Element
    public static int isCentered (int [] a){
        if(a.length == 0 || a.length % 2 == 0)
            return 0;
        else if(a.length == 1)
            return 1;
        else {
            int mid = a[a.length % 2 + 1];
                   
            for(int i=0; i< a.length;i++){
                if(mid >= a[i] && i != a.length % 2 + 1) {
                    
                    return 0;
                }
                    
            }
            return 1;
        }
    }
    
    //2.returns value based on the sum of even and odd numbers
    
    public static int getSumEvenOdd(int[] a){
        if(a.length ==0)
            return 0;
        else if(a.length == 1)
            return a[0];
        else {
            int Y = 0;
            int X = 0;
            for(int i=0; i < a.length; i++){
                if(a[i] % 2 == 0)
                    Y = Y + a[i];
                else
                    X = X + a [i];
            }
            return X - Y;
        }
    }
    //3.
    static char [] chart_start_length(char[ ] a, int start, int len){
        if(start<0 || len > a.length || start > a.length || (len + start)> a.length )
            return null;
        else{
            char [] res = new char [len];
            int k = 0;
            for(int i=start; i< len; i++){
                res [k] = a[i];
                k ++;
            }
            return res;
        }
    }
    
    //5.POE
    public static int get_poe(int[] a) {
        int idx = 1;
        int pre_sum = 0;
        int post_sum = 0;
     
        if(a == null || a.length == 0)
            return -1;
        else {
            while(idx <a.length){
                   for(int i=0; i< idx; i++){
                
                     pre_sum = pre_sum + a[i];
                
            }
            for(int j= idx + 1; j< a.length; j++) {
                    post_sum = post_sum + a [j]; 
                }
            if(pre_sum == post_sum){
             
                return idx;
               
            } 
            else {
                idx = idx + 1;
                pre_sum = 0;
                post_sum = 0;
            }
           
                
                 
            }
           return -1;
            
        }
    }
    
    //Test
    //1.
    public static int isMartian(int[ ] a) {
        if(a.length == 0 || (a.length == 1 && a[0] != 1))
            return 0;
        else {
            int nb_ones = 0;
            int nb_twos = 0;
            for(int i = 0; i< a.length; i++){
                if(a[i] == 1)
                    nb_ones++;
                else if(a[i] == 2)
                    nb_twos++;
                else if(i>0 && a[i] == a[i-1])
                    return 0;
            }
           if(nb_ones > nb_twos)
               return 1;
           else
               return 0;
        }
    }
   
    //2.
    public static int isMercurial(int[ ] a){
        boolean one_first_occur = false;
        boolean three_occ = false;
        boolean one_second_ocur = false;
        for(int i=0; i< a.length; i++){
            if(a[i] == 1 && !three_occ)
                one_first_occur = true;
            
            else if(a[i] == 3 && one_first_occur)
                three_occ = true;
            else if(a[i] == 1 && one_first_occur && three_occ)
                return 0;
        }
        return 1;
    }
    
    //3.
    public static  int isOlympic (int[ ] a){
        int max_value = 0;
        int sum_min_values = 0;
        int minimum_value = 0;
        for(int i = 0; i< a.length; i++){
           
            max_value = a [i];
            sum_min_values = 0;  
            
          for(int j= 0; j< a.length && j != i; j++){
             
                  
               if(a[j] < max_value){
                  sum_min_values = sum_min_values + a[j];
                  minimum_value = 0;
              }
              
              else if(max_value < a[j]) {
                  minimum_value = max_value;
                  sum_min_values = 0;
              }
            
                 
              if( max_value < sum_min_values)
                  return 0;
          }
          
          
    }
        return 1;
    }
    
    public static boolean isPalindrom(String word){
        
        String caseIgnore = word.toLowerCase();
        int right = caseIgnore.length() - 1;
       
        
            for(int j=0; j < caseIgnore.length(); j++) {
                 
               
                 char leftC = caseIgnore.charAt(j);
                 char rightC = caseIgnore.charAt(right);
                 if(leftC != rightC)
                     return false;
                right--;
                
            }
           
        
        
        return true;
    }