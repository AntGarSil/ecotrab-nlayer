/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function() {

    $.ajax({
        url: EpaTasasOcupURL,        
        type: 'GET',
        dataType: 'json',
        data: null,
        success: function(data) {
            
            //alert(data.prov_resid);
            //var i = 0;
            //var res = "<table>";
            //for(i = 0; i < data.length; i++){
            //    res += "<tr><td>";
            //    res += data[i].id;
            //    res += data[i].year;
            //    res += data[i].prov_resid;
            //    res += data[i].sexo;
            //    res += data[i].estud_gr;
            //    res += data[i].edad_gr;
            //    res += data[i].tocup;
            //    res += "</td></tr>";
            //}
            //res += "</table>";
            //$("#content").html(res);
            //alert(res);
            
            // Format series for jqplot
            var i = 0;
            var cnt1 = 0;
            var cnt2 = 0;
            var cnt3 = 0;
            var cnt4 = 0;
            var cnt5 = 0;
            var cnt6 = 0;
            var cnt7 = 0;
            var cnt8 = 0;
            var cnt9 = 0;
            var cnt10 = 0;
            
            var s96 = new Array();
            var s97 = new Array();
            var s98 = new Array();
            var s99 = new Array();
            var s00 = new Array();
            var s01 = new Array();
            var s02 = new Array();
            var s03 = new Array();
            var s04 = new Array();
            var s05 = new Array();
            
            var med1 = 0;
            var med2 = 0;
            var med3 = 0;
            var med4 = 0;
            var med5 = 0;
            var med6 = 0;
            var med7 = 0;
            var med8 = 0;
            var med9 = 0;
            var med10 = 0;
            
            for(i = 0; i < data.length; i++)
                {
                    if(data[i].year == 1996)
                        {
                            s96[cnt1] = data[i].tocup;
                            cnt1++;
                            med1 += s96[cnt1 - 1]/cnt1;
                        }
                    if(data[i].year == 1997)
                        {
                            s97[cnt2] = data[i].tocup;
                            cnt2++;
                            med2 += s97[cnt2 - 1]/cnt2;
                        }
                    if(data[i].year == 1998)
                        {
                            s98[cnt3] = data[i].tocup;
                            cnt3++;
                            med3 += s98[cnt3 - 1]/cnt3;
                        }
                    if(data[i].year == 1999)
                        {
                            s99[cnt4] = data[i].tocup;
                            cnt4++;
                            med4 += s99[cnt4 - 1]/cnt4;
                        }                   
                    if(data[i].year == 2000)
                        {
                            s00[cnt5] = data[i].tocup;
                            cnt5++;
                            med5 += s00[cnt5 - 1]/cnt5;
                        }
                    if(data[i].year == 2001)
                        {
                            s01[cnt6] = data[i].tocup;
                            cnt6++;
                            med6 += s01[cnt6 - 1]/cnt6;
                        }           
                    if(data[i].year == 2002)
                        {
                            s02[cnt7] = data[i].tocup;
                            cnt7++;
                            med7 += s02[cnt7 - 1]/cnt7;
                        }
                    if(data[i].year == 2003)
                        {
                            s03[cnt8] = data[i].tocup;
                            cnt8++;
                            med8 += s03[cnt8 - 1]/cnt8;
                        }       
                    if(data[i].year == 2004)
                        {
                            s04[cnt9] = data[i].tocup;
                            cnt9++;
                            med9 += s04[cnt9 - 1]/cnt9;
                        }       
                    if(data[i].year == 2005)
                        {
                            s05[cnt10] = data[i].tocup;
                            cnt10++;
                            med10 += s05[cnt10 - 1]/cnt10;
                        }                        
                }
                    
            //alert(med1);
            //alert(med2);
            //alert(med3);
            //alert(med4);
            var tickarray = ['1996','1997','1998','1999','2000','2001','2002','2003','2004','2005'];
            var line1 = [med1, med2, med3, med4, med5, med6, med7, med8, med9, med10];

            var plot1 = $.jqplot('chart1', [line1], {
                title: '',
                seriesDefaults:{
                    renderer:$.jqplot.BarRenderer,
                    rendererOptions: {
                        barPadding: 1,
                        barMargin: 50,
                        barDirection: 'vertical',
                        barWidth: 50
                    }
                    //pointLabels: { show: true}
                },
                axes: {
                    xaxis: {
                        renderer: $.jqplot.CategoryAxisRenderer,
                        ticks: tickarray
                    },
                    yaxis:{
                        tickOptions:{
                            formatString:'%.2f'
                        }
                },
                highlighter: {
                    sizeAdjust: 7.5
                },
                cursor: {
                    show: true
                }
                }
            });
        }
    });
});


