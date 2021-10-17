

for(let i=0;i<5;i++){
  
  for(let j=i;j<n-i-1;j++){
  
      if(a[j] < a[j+1]){
        swap(a[j],a[j+1]);
      }
  }
}
