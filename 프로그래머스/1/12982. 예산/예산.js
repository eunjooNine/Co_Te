function solution(d, budget) {
    //최대한 많은 부서를 지원하기위해서는 작은 부서부터 지원해야 함
    //오름차순하기
    d.sort((a,b) => a-b);
    let count=0;
    for (let i=0; i<d.length; i++){
        budget -= d[i];
        if(budget < 0){
            break;
        }count += 1;
    }
    return count;
    
    // return d.sort((a, b) => a - b).reduce((count, price) => {
    //     return count + ((budget -= price) >= 0);}, 0);
}