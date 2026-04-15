class Solution {
public:
    int calPoints(vector<string>& operations) {

         stack<int> st;
        for(string i : operations)
        {
           
          if(i=="+")
          {
            int top1=st.top();
            st.pop();
            int top2=st.top();
            st.push(top1);
            st.push(top1+top2);
          }

          else if(i=="D")
          {
            int top = st.top();
            st.push(top*2);
          }

          else if(i=="C")
          {
             st.pop();
          }
            
            else
            {
                st.push(stoi(i));
            }
          
        }
        int sum = 0;
        while (!st.empty()) {
            sum += st.top();
            st.pop();
        }
        
       return sum;    
    }

};