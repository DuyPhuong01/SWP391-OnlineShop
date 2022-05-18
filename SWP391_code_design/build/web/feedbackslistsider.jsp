<%-- 
    Document   : feedbackslistsider
    Created on : May 19, 2022, 3:52:42 AM
    Author     : Duy Phuong
    --%>

    <%@page contentType="text/html" pageEncoding="UTF-8"%>
        <div class="search-container">
            <input class="form-control" type="text" name="sider-search" placeholder="Search Fullname" aria-label="default input example">
        </div>
        <h5>Filter</h5>
        <div class="status-selection-container">
            <select class="form-select" aria-label="Default select example">
                <option selected>Select status</option>
                <option value="1">On</option>
                <option value="2">Off</option>
            </select>
        </div>
        <div class="product-selection-container">
            <select class="form-select" aria-label="Default select example">
                <option selected>Select by Product</option>
                <option value="1">Option 1</option>
                <option value="2">Option 2</option>
                <option value="2">Option 3</option>
                <option value="2">Option 4</option>
            </select>
        </div>
        <div class="rating-selection-container">
            <select class="form-select" aria-label="Default select example">
                <option selected>Select by Rating</option>
                <option value="1">Option 1</option>
                <option value="2">Option 2</option>
                <option value="2">Option 3</option>
                <option value="2">Option 4</option>
            </select>
        </div>
        <h5>Sort by</h5>
        <div class="sort-selection-container">
            <select class="form-select" aria-label="Default select example">
                <option selected>Sort By</option>
                <option value="1">Fullname</option>
                <option value="2">Product Name</option>
                <option value="3">Rated Star</option>
                <option value="4">Status</option>
            </select>
        </div>
        <div class="sort-selection-container">
            <select class="form-select" aria-label="Default select example">
                <option selected>Sort By</option>
                <option value="1">Asc</option>
                <option value="2">Desc</option>
            </select>
        </div>