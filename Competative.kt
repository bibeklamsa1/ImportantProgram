class Competative {
    fun myfun(s:String):String{
        var str=""
        var length = s.length
        var count = 0
        var index = 0
        while (index<(length-1)){
            if(s[index].equals(s[index+1])){
                count+=1
            }
            else{
                if(count==0){
                    str+=s[index]+1
                }else{
                    str+=s[index]+count+1
                    count=0
                }
            }

            index++
        }
        return str
    }
}

fun main() {
    var c = Competative()
    var s=  c.myfun("aabbccda")
    print(s)

}