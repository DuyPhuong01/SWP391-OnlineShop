<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Online shopping system</title>

        <!--bootstrap-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">

        <link href="../css/stylesaleheadersider.css" rel="stylesheet"/>
        <link href="../css/styleadminsettings.css" rel="stylesheet"/>
        <!--font-awesome-->
        <script src="https://kit.fontawesome.com/3c84cb624f.js" crossorigin="anonymous"></script>
    </head>
    <body>
        <jsp:directive.include file="salenavbar.jsp"/>
        <div class="wrapper-login">
            <jsp:directive.include file="sidebar.jsp"/>
            <aside class="right-side">
                <section class="content container">
                    <div class="row" style="margin-bottom: 20px;">
                        <h2>Settings List</h2>
                        <div class="left">
                            <form class="flex flex-column" action="settingslist" method="post" id="submit-frm">                               
                                <div class="filter flex flex-column">
                                    <h3>Filter</h3>
                                    <div class="setting-types flex flex-column" id="">
                                        <span class="filter-option">Type</span>
                                        <c:set value="${requestScope.checkedType}" var="cs"/>
                                        <c:set value="${requestScope.type}" var="sl"/>
                                        <c:forEach begin="0" end="${sl.size()-1}" var="i">
                                            <div class="set-type"><input type="checkbox" value="${sl[i]}" name="type" <c:if test="${cs[i]}">checked</c:if>/> ${sl[i]}</div>
                                            </c:forEach>

                                    </div>
                                    <div class="filter-status flex flex-column">
                                        <span class="filter-option">Status</span>
                                        <div><input type="checkbox" value="1" name="status" ${requestScope.activate?"checked":""}/>Activate</div>
                                        <div><input type="checkbox" value="0" name="status" ${requestScope.deactivate?"checked":""}/>Deactivate</div>
                                    </div>
                                    <div class="hidden-input">
                                        <input type="hidden" name="orderOption" value="${requestScope.orderOption}" id="orderOption"/>
                                        <input type="hidden" name="sequence" value="${requestScope.sequence}" id="sequence"/>
                                        <input type="hidden" name="page" value="${requestScope.pageNumber}" id="pageNumber"/>
                                    </div>
                                </div>
                                <div class="search-order">
                                    <span class="filter-option">Search setting</span>
                                    <div>   
                                        <input type="text" name="key" placeholder="Search setting" value="${requestScope.key}"/>
                                    </div>
                                </div>

                                <button type="submit" class="submit-btn">Filter</button>

                            </form>
                        </div>
                        <div class="right">
                            <div class="sort-bar-setting flex">
                                <div class="flex-1"></div>
                                <div class="sort-bar-title">Sort</div>
                                <div>
                                    <select name="orderOption" onchange="submitFormWithNewOrderOption(this);">
                                        <option value="setting_id" ${requestScope.orderOption eq "setting_id"?"selected":""}>Setting ID</option>
                                        <option value="type" ${requestScope.orderOption eq "type"?"selected":""}>Type</option>
                                        <option value="value" ${requestScope.orderOption eq "value"?"selected":""}>Value</option>
                                        <option value="[order]" ${requestScope.orderOption eq "[order]"?"selected":""}>Order</option>
                                        <option value="status" ${requestScope.orderOption eq "status"?"selected":""}>Status</option>
                                    </select>
                                </div>

                                <div>
                                    <select name="orderOption" onchange="submitFormWithSequence(this);">
                                        <option value="desc" ${requestScope.sequence eq "desc"?"selected":""}>Descending</option>
                                        <option value="asc" ${requestScope.sequence eq "asc"?"selected":""}>Ascending</option>
                                    </select>
                                </div>
                            </div> 
                            <div class="main-setting">
                                <c:if test="${requestScope.settingsList.size() != 0}">
                                    <div class="settings-wrapper">
                                        <table class="table .table-striped table-hover .table-bordered">
                                            <thead>
                                                <tr>
                                                    <th scope="col">SettingID</th>
                                                    <th scope="col">Type</th>
                                                    <th scope="col">Value</th>
                                                    <th scope="col">Order</th>
                                                    <th scope="col">Status</th>
                                                </tr>
                                            </thead>
                                            <tbody class="table-group-divider">
                                                <c:forEach items="${requestScope.settingsList}" var="i">
                                                    <tr>
                                                        <td>${i.settingId}</td>
                                                        <td>${i.type}</td>
                                                        <td>${i.value}</td>
                                                        <td>${i.order}</td>
                                                        <td>
                                                            <span class="activated">
                                                                <c:if test="${i.status == 1}">Activated</c:if>
                                                            </span>
                                                            <span class="deactivated">
                                                                <c:if test="${i.status != 1}">Deactivated</c:if>
                                                            </span>
                                                        </td>
                                                    </tr>
                                                </c:forEach>
                                            </tbody>
                                        </table>
                                    </div>
                                    <nav aria-label="...">
                                        <ul class="pagination">
                                            <c:if test="${requestScope.numberPage < 3}">
                                                <li class="page-item <c:if test="${requestScope.pageNumber == 1}">disabled</c:if>">
                                                    <span class="page-link" onclick="submitFormWithNewPage(${requestScope.pageNumber-1})"><</span>
                                                </li>
                                                <c:forEach begin="0" end="${requestScope.numberPage - 1}" var="i">

                                                    <li class="page-item" onclick="submitFormWithNewPage(${i+1})">
                                                        <span class="page-link ${requestScope.pageNumber == (i+1)?"active":""}">${i+1}</span>
                                                    </li>
                                                </c:forEach>
                                                <li class="page-item <c:if test="${requestScope.pageNumber == requestScope.numberPage}">disabled</c:if>">
                                                    <span class="page-link" onclick="submitFormWithNewPage(${requestScope.pageNumber+1})">></span>
                                                </li>
                                            </c:if>
                                            <c:if test="${requestScope.numberPage >= 3}">
                                                <c:if test="${requestScope.pageNumber == 1}">
                                                    <li class="page-item <c:if test="${requestScope.pageNumber == 1}">disabled</c:if>">
                                                        <span class="page-link" onclick="submitFormWithNewPage(${requestScope.pageNumber-1})"><</span>
                                                    </li>
                                                    <li class="page-item" onclick="submitFormWithNewPage(1)">
                                                        <span class="page-link active">1</span>
                                                    </li>
                                                    <li class="page-item" onclick="submitFormWithNewPage(2)">
                                                        <span class="page-link">2</span>
                                                    </li>
                                                    <li class="page-item" onclick="submitFormWithNewPage(3)">
                                                        <span class="page-link">3</span>
                                                    </li>

                                                    <li class="page-item <c:if test="${requestScope.pageNumber == requestScope.numberPage}">disabled</c:if>">
                                                        <span class="page-link" onclick="submitFormWithNewPage(${requestScope.pageNumber+1})">></span>
                                                    </li>
                                                </c:if>
                                                <c:if test="${requestScope.pageNumber == requestScope.numberPage}">
                                                    <li class="page-item <c:if test="${requestScope.pageNumber == 1}">disabled</c:if>">
                                                        <span class="page-link" onclick="submitFormWithNewPage(${requestScope.pageNumber-1})"><</span>
                                                    </li>

                                                    <li class="page-item" onclick="submitFormWithNewPage(${requestScope.pageNumber-2})">
                                                        <span class="page-link">${requestScope.pageNumber-2}</span>
                                                    </li>
                                                    <li class="page-item" onclick="submitFormWithNewPage(${requestScope.pageNumber-1})">
                                                        <span class="page-link">${requestScope.pageNumber-1}</span>
                                                    </li>
                                                    <li class="page-item" onclick="submitFormWithNewPage(${requestScope.pageNumber})">
                                                        <span class="page-link active">${requestScope.pageNumber}</span>
                                                    </li>
                                                    <li class="page-item <c:if test="${requestScope.pageNumber == requestScope.numberPage}">disabled</c:if>">
                                                        <span class="page-link" onclick="submitFormWithNewPage(${requestScope.pageNumber+1})">></span>
                                                    </li>
                                                </c:if>
                                                <c:if test="${requestScope.pageNumber != 1 && requestScope.pageNumber != requestScope.numberPage}">
                                                    <li class="page-item <c:if test="${requestScope.pageNumber == 1}">disabled</c:if>">
                                                        <span class="page-link" onclick="submitFormWithNewPage(${requestScope.pageNumber-1})"><</span>
                                                    </li>
                                                    <li class="page-item" onclick="submitFormWithNewPage(${requestScope.pageNumber-1})">
                                                        <span class="page-link">${requestScope.pageNumber-1}</span>
                                                    </li>
                                                    <li class="page-item" onclick="submitFormWithNewPage(${requestScope.pageNumber})">
                                                        <span class="page-link active">${requestScope.pageNumber}</span>
                                                    </li>
                                                    <li class="page-item" onclick="submitFormWithNewPage(${requestScope.pageNumber+1})">
                                                        <span class="page-link">${requestScope.pageNumber+1}</span>
                                                    </li>
                                                    <li class="page-item <c:if test="${requestScope.pageNumber == requestScope.numberPage}">disabled</c:if>">
                                                        <span class="page-link" onclick="submitFormWithNewPage(${requestScope.pageNumber+1})">></span>
                                                    </li>
                                                </c:if>

                                            </c:if>
                                        </ul>
                                    </nav>                                    
                                </c:if>
                                <c:if test="${requestScope.settingsList.size() == 0}">
                                    <div style="margin-top: 20px;
                                         padding: 20px;
                                         background: #fff;">Their is no settings</div>
                                </c:if>
                            </div>
                        </div>
                    </div>
                </section>
            </aside>
        </div>
        <div class="add-settings" id="add-new-settings">
            + New settings
        </div>
    </body>
    <script
        src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.4/Chart.js">
    </script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
    <script src="../js/admin.js"></script>
</html>