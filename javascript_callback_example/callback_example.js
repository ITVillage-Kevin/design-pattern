function increaseNum(num, callback) {
    var result = callback(num);
    console.log(result);
}

var callback = function(num){
    return ++num;
};

increaseNum(1, callback);