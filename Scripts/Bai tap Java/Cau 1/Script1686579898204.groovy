List arr =[1, 2, 3, 4, 5, 6, 7, 8, 9]
List sochan=[]
List sole=[]

for(int i = 0; i < arr.size() ; i++) {
	if(arr[i]%2 == 0) 
		sochan.add(arr[i])
	else sole.add(arr[i])

}
println sole
println sochan