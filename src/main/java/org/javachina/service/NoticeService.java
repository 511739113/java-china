package org.javachina.service;

import com.blade.jdbc.Paginator;

import java.util.Map;

public interface NoticeService {

	boolean save(String type, Integer to_uid, Integer event_id);

	boolean read(Integer to_uid);

	Paginator<Map<String, Object>> getNoticePage(Integer to_uid, Integer page, Integer count);

	int getNotices(Integer to_uid);

}
