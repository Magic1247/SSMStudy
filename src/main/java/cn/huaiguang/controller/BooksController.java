package cn.huaiguang.controller;

import cn.huaiguang.pojo.Books;
import cn.huaiguang.service.BooksService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BooksController {
    @Autowired
    private BooksService booksService;

    @GetMapping(value = "/getBooksById",produces="application/json;charset=UTF-8")
    public String getBooksById(Integer id) {
        List<Integer> list = new ArrayList<>();
        list.add(id);
        List<Books> books = booksService.getBooksById(list);
        return JSON.toJSONString(books);
    }
}
