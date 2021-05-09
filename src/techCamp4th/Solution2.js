function solution(leave,day,holidays) {
    if (day =='MON'){
        holidays = holidays.concat([6,7,13,14,20,21,27,28]);
    } else if(day == 'TUE'){
        holidays = holidays.concat([5,6,12,13,19,20,26,27]);
    } else if (day == 'WED'){
        holidays = holidays.concat([4,5,11,12,18,19,25,26]);
    } else if (day == 'THU'){
        holidays = holidays.concat([3,4,10,11,17,18,24,25]);
    } else if (day =='FRI'){
        holidays = holidays.concat([2,3,9,10,16,17,23,24,30]);
    } else if (day =='SAT'){
        holidays = holidays.concat([1,2,8,9,15,16,22,23,29,30]);
    } else {
        holidays = holidays.concat([1,7,8,14,15,21,22,28,29]);
    }
    holidays.sort(function(a, b)  {
        if(a > b) return 1;
        if(a === b) return 0;
        if(a < b) return -1;
    });
    var answer = 0;
    var holidayIndex = 0;
    var maxDay = 0;

    for (var i = 1 ; i <= 30 ; i++){
        var remain = leave;

        while (holidays[holidayIndex]<i){
            holidayIndex++;
        }
        j=i;
        while (remain>=0){

            if (j == holidays[holidayIndex]){
                maxDay++;
                if (holidays[holidayIndex]==holidays[holidayIndex+1]){
                    holidayIndex++;
                }
                holidayIndex++;
            } else {
                remain--;
                maxDay++;
            }
            j++;
        }
        if (answer<maxDay){
            answer=maxDay;
        }
        holidayIndex=0;
        maxDay=0;
    }
    return answer;
}

console.log(solution(4,'MON',[6, 21, 23, 27, 28]));