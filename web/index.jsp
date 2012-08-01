<%-- 
    Document   : index
    Created on : 16-jul-2012, 16:21:23
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ecotrab Graph</title>
        <script type="text/javascript" src="JS/jquery.min.js"></script>
        
        <script type="text/javascript" src="JS/jqplot.min.js"></script>
        <script type="text/javascript" src="JS/jqplot.barRenderer.min.js"></script>
        <script type="text/javascript" src="JS/jqplot.categoryAxisRenderer.min.js"></script>
        <script type="text/javascript" src="JS/jqplot.pointLabels.min.js"></script>
        <script type="text/javascript" src="JS/jqplot.canvasAxisLabelRenderer.min.js"></script>
        <script type="text/javascript" src="JS/jqplot.canvasAxisTickRenderer.min.js"></script>
        <script type="text/javascript" src="JS/jqplot.canvasTextRenderer.min.js"></script>
        <script type="text/javascript" src="JS/jqplot.dateAxisRenderer.min.js"></script>
        <script type="text/javascript" src="JS/jqplot.canvasTextRenderer.min.js"></script>
        <script type="text/javascript" src="JS/jqplot.highlighter.min.js"></script>
        <script type="text/javascript" src="JS/jqplot.cursor.min.js"></script>
        
        <script type="text/javascript" src="JS/jqueryAjaxExample.js"></script>
        
        <link type="text/css" href="CSS/smoothness/jquery-ui-1.8.22.custom.css" rel="stylesheet" />	
	<script type="text/javascript" src="JS/jquery-ui-1.8.22.custom.min.js"></script>

        <link type="text/css" href="CSS/styles-common.css" rel="stylesheet"/>
    </head>

    <body style='background-color:#D3D3D3'>
        <header>
            <h1 style='margin-left:10px; margin-bottom:10px'> Medias tasa ocupación por año</h1>
        </header>

 <div id="chart1" style='margin-left: 250px; width:800px; height:400px'></div>
    </body>
</html>