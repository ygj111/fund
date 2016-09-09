<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link href="${ctx}/assets/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
		<link rel="stylesheet" href="${ctx}/assets/fontawesome/css/font-awesome.min.css">
		<link href="${ctx}/assets/metisMenu/2.2.0/metisMenu.min.css" rel="stylesheet">
		<link href="${ctx}/assets/datatables/1.10.10/dataTables.bootstrap.min.css" rel="stylesheet">
    	<link rel="stylesheet" href="${ctx}/assets/css/sidebar.css">
    	<script src="${ctx}/assets/jquery/1.11.3/jquery.min.js"></script>
    	<script src="${ctx}/assets/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    	<script src="${ctx}/assets/metisMenu/2.2.0/metisMenu.min.js"></script>
    	<script src="${ctx}/assets/datatables/1.10.10/jquery.dataTables.min.js"></script>
    	<script src="${ctx}/assets/datatables/1.10.10/dataTables.bootstrap.min.js"></script>
    	<script src="${ctx}/assets/js/json2.js"></script>
    <title></title>
</head>
<body>
    <!-- top nav -->
    <jsp:include page="inc/nav_top.jsp"></jsp:include>
    <!-- End of top nav -->
    <!-- Main Container -->
    <div id="main-container">
        <!-- side bar -->
        <jsp:include page="inc/nav_left.jsp"></jsp:include>
        <!-- End side bar -->
        <!-- content -->
        <div id="main_content" class="main-content container-fluid">
            <!-- Title -->
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">数据字典</h1>
                </div>
            </div>
            <!-- End Title -->
            <!-- panel -->
             <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                           	 数据字典
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                        	<div class="container-fluid">
                                <div class="row">
                                    <div class="col-sm-3" style="margin-left: 0px; margin-bottom: 5px">
                                        <div class=" input-group">
                                            <input type="text" class="form-control" placeholder="Search...">
                                            <span class="input-group-btn">
                                                <button class="btn btn-default" type="button" >
                                                    <i class="fa fa-search"></i>
                                                </button>
                                            </span>
                                        </div>
                                    </div>
                                    <div class="col-sm-9 text-right">
                                        <div class="btn-group">
                                            <button class="btn btn-default" id="btn_modify" type="button">
                                                <i class="fa fa-pencil"></i> 修改
                                            </button>
                                            <button class="btn btn-default" id="btn_add" type="button" data-toggle="modal" data-target="#dictUpdate">
                                                <i class="fa fa-plus"></i> 新增
                                            </button>
                                            <button class="btn btn-default" id="btn_del" type="button" data-toggle="tooltip"
                                                    data-placement="right" title="删除">
                                                <i class="fa fa-minus"></i> 删除
                                            </button>
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-sm-12">
                                        <!-- data table -->
                                        <div class="dataTable_wrapper">
                                            <table class="table table-striped table-bordered table-hover text-center" id="dict">
                                                <thead>
                                                    <tr>
                                                        <th class="text-center"><input type="checkbox" id="checkAll" name="checkAll"></th>
                                                        <th class="text-center">编码</th>
                                                        <th class="text-center">名称</th>
                                                        <th class="text-center">状态</th>
                                                        <th class="text-center">parent</th>
                                                        <th class="text-center">分类</th>
                                                    </tr>
                                                </thead>
                                                <tbody>

                                                </tbody>
                                            </table>
                                        </div>
                                        <!-- data table -->
                                    </div>
                                </div>
                                <div class="row">
                                    <!-- pagination -->
                                    <div class="col-sm-6"></div>
                                    <div class="col-sm-6">
                                        <ul class="pagination navbar-right" style="margin: 0px">
                                            <li><a href="#">&laquo;</a></li>
                                            <li><a href="#">1</a></li>
                                            <li><a href="#">2</a></li>
                                            <li><a href="#">3</a></li>
                                            <li><a href="#">4</a></li>
                                            <li><a href="#">5</a></li>
                                            <li><a href="#">&raquo;</a></li>
                                        </ul>
                                    </div>
                                    <!-- End pagination -->
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- end panel -->
        </div>
        <!-- End content -->
    </div>
    <!-- End Main Container -->
    
	<!--Modal-->
    <div class="modal fade" id="dictUpdate" tabindex="-1" role="dialog"
         aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close"
                            data-dismiss="modal" aria-hidden="true">
                        &times;
                    </button>
                    <h4 class="modal-title" id="myModalLabel">
                        	模态框（Modal）标题
                    </h4>
                </div>
                <div class="modal-body">
                    <form id="dictForm" role="form">
                        <div class="form-group">
                            <label for="dict_code" class="control-label">Code</label>
                            <input type="text" class="form-control" name="code" id="code">
                        </div>
                        <div class="form-group">
                            <label for="dict_name" class="control-label">名称</label>
                            <input type="text" class="form-control" name="name" id="name">
                        </div>
                        <div class="form-group">
                            <label for="dict_status" class="control-label">状态</label>
                            <select class="form-control" id="status" name="status">
                                <option value="0" selected>可用</option>
                                <option value="1">禁用</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="dict_parent" class="control-label">Parent</label>
                            <input type="text" class="form-control" id="parent" name="parent">
                        </div>
                        <div class="form-group">
                            <label for="dict_category" class="control-label">分类</label>
                            <input type="text" class="form-control" id="category" name="category">
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default"
                            data-dismiss="modal">关闭
                    </button>
                    <button type="button" id="btn_save" class="btn btn-primary">
                        	保存
                    </button>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal -->
    
    <script language="javascript">
   		// 页面初始化
        $(document).ready(function() {
        	// 初始化左侧导航栏
        	$("#side-menu").metisMenu();
        	
        	// 初始化内容UI
            $('#dict').DataTable({
            	ajax: {
            		url: '${ctx}/fund/listDic',
            		dataSrc: ''
            	},
            	columns: [
            		{'data': 'code',
            			render: function(data) {
            				return "<input type='checkbox' name='dictCheck' value='" + data +"'>";
            			}},
            		{'data': 'code'},
            		{'data': 'name'},
            		{'data': 'status'},
            		{'data': 'parent'},
            		{'data': "category"}
            	],
                paging: false,
                searching:false,
                ordering: false,
                info:false
            });
        } );
   		
   		// 全选方法
   		$('#checkAll').on('click', function() {
   			console.info('checkall status:' + $(this).prop("checked"));
   	   		$("input[name='dictCheck']").prop('checked', $(this).prop('checked'));
   	   	});
   		
   		// 修改操作
   		$('#btn_modify').on('click', function() {
   			// 判断表格中是否有行被选中
   			var code;
   			
   			$('input[name="dictCheck"]').each(function(i) {
   				if ($(this).prop('checked')) {
   					code = $(this).attr('value');
   					
   					// 将选中行的数据填充到模态窗口
   					var td = $(this).parent().nextAll();
   					$('#code').attr('value', code);
   					$('#name').attr('value', td.eq(1).text());
   					$('#status').val(td.eq(2).text());
   					$('#parent').attr('value', td.eq(3).text());
   					$('#category').attr('value', td.eq(4).text()); 
   					return;
   				}
   			});
   			
   			if (code == null) {
   				alert("请选择一条需要修改的数据字典！");
   				return;
   			}
   			
   			$('#myModalLabel').text('修改字典数据');		// 修改label
   			$("#dictUpdate").modal('toggle');
   		});
   		
   		// 保存字典数据
   		$('#btn_save').on('click', function() {
   			var data = $('#dictForm').serializeArray();	// 将form中的表单元素序列化成json对象；
   			
   			var o = {};
   			$.each(data, function() {    
   		       if (o[this.name]) {    
   		           if (!o[this.name].push) {    
   		               o[this.name] = [o[this.name]];    
   		           }    
   		           o[this.name].push(this.value || '');    
   		       } else {    
   		           o[this.name] = this.value || '';    
   		       }    
   		   	});    
   		    
   			var jsonData = JSON.stringify(o);
   			console.info(jsonData);
   			
   			$.ajax({
   				type: 'POST',
   				url: '${ctx}/fund/saveDict',
   				data: jsonData,
   				contentType: "application/json; charset=utf-8", 
   				dataType:"json",
   				success: function() { 
   						$("#dictUpdate").modal("hide");
   						alert("保存成功");
   						
   					}
   			}); 
   		});
    </script>
</body>
</html>