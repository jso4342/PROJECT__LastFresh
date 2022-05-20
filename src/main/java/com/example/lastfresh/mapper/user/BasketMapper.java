package com.example.lastfresh.mapper.user;

import com.example.lastfresh.domain.dto.BasketDTO;
import com.example.lastfresh.domain.vo.BasketVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BasketMapper {
    //    userNum 별 게시글 목록
    public List<BasketVO> getListByUserNum(Long userNum);

    public List<BasketDTO> getListByDTO(Long uerNum);

    public void removeItems(Long userNum);
//
//    //    사기

//    public void insert(String hi);
//
//
//    //    특정 글 가져오기
//    public  get( );
}

