var api = apiclient;

app = (function () {


    var map;


    function buscar(data) {
        $("#lblname").text("City: "+data.name);
        document.getElementById("datos").textContent = "City: "+data.name+
        "\r\nId: "+data.id+
        "\r\nVisibility: "+data.visibility+
        "\r\nTimezone: "+data.timezone+
        "\r\nHumidity: "+data.main.humidity+
        "\r\nTemperatura Maxima: "+data.main.temp+
        "\r\nTemperatura Minima: "+data.main.temp_min+
        "\r\nCountry: "+data.sys.country+
        "\r\nLongitud: "+data.coord.lon+
        "\r\nLatitud: "+data.coord.lat;
        createMap(data);
    }

    function createMap(data) {
        map = new google.maps.Map(document.getElementById('mapa'), {
            center: {lat: data.coord.lat, lng: data.coord.lon},
            zoom: 10
        });
        console.info(data.coord.lon, data.coord.lat);
    }

    return {

        buscar: function (ciudad) {
            api.buscar(ciudad, buscar);
        }
    }

})();