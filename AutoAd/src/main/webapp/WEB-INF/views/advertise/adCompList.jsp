<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script type="text/javascript" src="/app/js/jquery-1.12.3.js"></script>
<script type="text/javascript" src="/app/js/advertise.js"></script>
<script type="text/javascript" src="/app/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/app/js/bootbox.js"></script>
<table>
	<tr>
		<td><h3>AdCorps</h3></td>
		<td>
			<!-- Button trigger modal -->
			<button type="button" class="btn btn btn-default navbar-btn"
				data-toggle="modal" data-target="#regAdvertise">広告登録</button>
		</td>
	</tr>
</table>
<table class="table table-striped"
	style="width: 100%; margin-left: 0.67em;">
	<tr>
		<td style="width: 100px;">ID</td>
		<td style="width: 700px;">Name</td>
		<td>Actions</td>
	</tr>

	<c:forEach items="${pageInfo.resultList}" var="adComp">
		<tr>
			<td>${adComp.id}</td>
			<td id="adNm${adComp.id}" >${adComp.adNm}</td>
			<td><button type="button" class="btn btn-default ad_corp_list_button" id="modfyAdCompName${adComp.id}" onclick="javascript:modiSelAdCompNm(${adComp.id})">広告編集</button>
			    <button type="button" class="btn btn-default ad_corp_list_button" id="delBtn${adComp.id}" onclick="javascript:delAdCompNm(${adComp.id})">削除</button></td>	
		</tr>
	</c:forEach>
</table>
<table>
	<c:if test="${pageInfo.pageMapParam.totalCount > 0}">
		<nav>
			<ul class="pagination">
				<li><a
					href="/app/advertise/adCompList.do?clickPageNo=${pageInfo.pageMapParam.previewPage}"
					aria-label="Previous"> <span aria-hidden="true">&laquo; Previous</span></a></li>

				<c:forEach var="i" begin="${pageInfo.pageMapParam.startPage}"
					end="${pageInfo.pageMapParam.endPage}">
					<li><a href="/app/advertise/adCompList.do?clickPageNo=${i}">${i}</a></li>
				</c:forEach>

				<li><a
					href="/app/advertise/adCompList.do?clickPageNo=${pageInfo.pageMapParam.nextPage}"
					aria-label="Next"> <span aria-hidden="true">Next &raquo;</span>
				</a></li>
			</ul>
		</nav>
	</c:if>
</table>
<!--登録 Modal -->
<div class="modal fade" id="regAdvertise" tabindex="-1" role="dialog"
	aria-labelledby="myModalLabel">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<h4 class="modal-title" id="myModalLabel">広告登録画面</h4>
			</div>
			<div class="modal-body">
				<div class="input-group">
					<span class="input-group-addon" id="basic-addon3">広告名</span>
					<input type="text" class="form-control" id="adCorpName" aria-describedby="basic-addon3">
				</div>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
				<button type="button" class="btn btn-default" id="regAdvertiseBtn">登録</button>
			</div>
		</div>
	</div>
</div>
<!--編集 Modal -->
<div class="modal fade" id="modifyAdCompNm" tabindex="-1" role="dialog"
	aria-labelledby="myModalLabel">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<h4 class="modal-title" id="myModalLabel">広告編集画面</h4>
			</div>
			<div class="modal-body">
				<div class="input-group">
					<span class="input-group-addon" id="basic-addon3">広告名</span>
					<input type="text" class="form-control" id="moDadCorpNm" aria-describedby="basic-addon3">
				</div>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
				<button type="button" class="btn btn-default" id="modiAdBtn" onclick="modifyAdCompNm()">編集完了</button>
			</div>
		</div>
	</div>
</div>
<!--削除 Modal -->
<div class="modal fade" id="delAdCompNm" tabindex="-1" role="dialog"
	aria-labelledby="myModalLabel">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<h4 class="modal-title" id="myModalLabel">本当に削除しますか？</h4>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
				<button type="button" class="btn btn-default" id="delAdBtn" onclick="delOkAdCompNm()">削除</button>
			</div>
		</div>
	</div>
</div>

<input type="hidden" id="hdnId" name="hdnId" value="">
<input type="hidden" id="delHdnId" name="delHdnId" value="">
<!-- orderyBy ASCの場合  -->
<%-- <input type="hidden" id="hdnCurrentPageNo" name="hdnCurrentPageNo" value="${pageInfo.pageMapParam.currentPage}"> --%>
<!-- orderyBy DESCの場合  -->
<input type="hidden" id="hdnCurrentPageNo" name="hdnCurrentPageNo" value="1">
