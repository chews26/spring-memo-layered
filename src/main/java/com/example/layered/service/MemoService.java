package com.example.layered.service;


import com.example.layered.dto.MemoRequestDto;
import com.example.layered.dto.MemoResponseDto;
import com.example.layered.entity.Memo;
import com.example.layered.repository.MemoRepository;

import java.util.List;

public interface MemoService {
    MemoResponseDto saveMemo(MemoRequestDto dto);
    List<MemoResponseDto> findAllMemos();
}
