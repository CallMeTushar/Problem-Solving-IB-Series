int Solution::isPower(int n) {
    
     if(n==1)
        return 1;
        
        for(int a=2;a*a<=n;a++){
            
            float l=log(n)/log(a);
            
            if(floor(l)==ceil(l))
            return 1;
            
        }
        
        return 0;
}
