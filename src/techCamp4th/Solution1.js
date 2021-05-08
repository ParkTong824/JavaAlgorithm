function solution(weights, head2head){
    var answer = [];
    var rate = [];
    for (var i = 0 ; i < weights.length ; i++){
        var index = [0,0,0];
        index[2] = i;
        for (var j = 0; j < weights.length ; j++) {
            if (j==i) {
                continue;
            }
            var isWin = head2head[i].charAt(j);
            if (isWin=='W') {
                index[0]++;
                if (weights[i]<weights[j]) {
                    index[1]++;
                }
            }
        }
        rate[i] = index;
    }
    rate.sort( function(a, b) {
        return (a[0] - b[0]) || (a[1] - b[1]) || weights[a] - weights[b];
    });
    for (var i = 0 ; i< rate.length ; i++){
        answer[i] = rate[rate.length-1-i][2]+1;
    }
    return answer;
}
