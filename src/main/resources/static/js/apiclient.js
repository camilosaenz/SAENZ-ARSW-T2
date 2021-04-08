apiclient = (function () {

    return {

        buscar: function(ciudad, callback) {
			
            var get = $.getJSON(`/clima/ciudad/${ ciudad }`);
            $.when (get).done(function (data) {
                callback(data);
            });
        }
    }
})();