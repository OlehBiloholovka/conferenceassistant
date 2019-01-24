package ifit.cluster.cassistant.service;

import ifit.cluster.cassistant.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicServiceImpl implements TopicService {

    @Autowired
    private TopicRepository topicRepository;

    @Override
    public Topic getTopic(Long topicId) {
        return topicRepository.findById(topicId);
    }

    @Override
    public Integer incrementRate(Long topicId) {

        topicRepository.incrementRate(topicId);
        topicRepository.findById(topicId).getRate;
        return 0;
    }

    @Override
    public boolean checkEmail(String email) {
        return false;
    }
}