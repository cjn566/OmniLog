
$( document ).ready(function() {
    $.ajax({
        url : 'ajaxtest.html',
        success : function(data) {
            var obj = JSON.parse(data);
            console.log(obj);
        }
    });
});