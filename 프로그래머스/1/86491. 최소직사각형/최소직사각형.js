function solution(sizes) {
    //일단 정렬을 해야 함
    let resizes=[];
    
    for(let i=0; i<sizes.length; i++){
        for(let j=0; j<1; j++){
            if(sizes[i][j]>=sizes[i][j+1]){
                resizes.push(sizes[i]);
            } else{
                resizes.push(sizes[i].reverse());
            }
        }
    }
    
    // 지갑 크기 구하기
    let w=resizes[0][0];
    let h=resizes[0][1];
    let count=0;

    for(let i=0; i<resizes.length-1; i++){
        if(w<resizes[i+1][0]){
            w=resizes[i+1][0];
        }
        if(h<resizes[i+1][1]){
            h=resizes[i+1][1];
        }
    }
    
    return w*h;
    
//     const rotated = sizes.map(([w, h]) => w < h ? [h, w] : [w, h]);

//     let maxSize = [0, 0];
//     rotated.forEach(([w, h]) => {
//         if (w > maxSize[0]) maxSize[0] = w;
//         if (h > maxSize[1]) maxSize[1] = h;
//     })
//     return maxSize[0]*maxSize[1];
}