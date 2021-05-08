function solution(prices) {
    var answer = [];
    var nowPrice = prices[0];
    var isUp = undefined;
    var length = 0;
    var beforeLength = 0;
    for (var i = 1 ; i < prices.length ; i++){
        if (prices[i]>nowPrice){
            if (isUp ==undefined){
                if (length!=0 && beforeLength!=0){
                    answer[answer.length]=(beforeLength<length ? beforeLength : length);
                }
                beforeLength=0;
                length=1;
                isUp = true;
                nowPrice = prices[i];
            } else if (isUp == true){
                length++;
                nowPrice = prices[i];
            } else {
                length++;
                if (length!=0 && beforeLength!=0){
                    answer[answer.length]=(beforeLength<length ? beforeLength : length);
                }
                beforeLength = length;
                length = 1;
                isUp = true;
            }
        } else if (prices[i]<nowPrice){
            if (isUp ==undefined){
                if (length!=0 && beforeLength!=0){
                    answer[answer.length]=(beforeLength<length ? beforeLength : length);
                }
                beforeLength=0;
                length=1;
                isUp = false;
                nowPrice = prices[i];
            } else if (isUp == false){
                length++;
                nowPrice = prices[i];
            } else {
                length++;
                if (length!=0 && beforeLength!=0){
                    answer[answer.length]=(beforeLength<length ? -beforeLength : -length);
                }
                beforeLength = length;
                length = 1;
                isUp = false;
            }
        } else {
            length++;
            if (length!=0 && beforeLength!=0){
                answer[answer.length]=(beforeLength<length ? beforeLength : length);
            }
            beforeLength=0;
            length=0;
            isUp=undefined;
        }
    }
    if (beforeLength!=0){
        answer[answer.length]=(beforeLength<length ? beforeLength : length);
    }
    return answer;
}

var prices = [1000, 2000, 3000, 2000, 3000, 4000, 3000];
console.log(solution(prices));