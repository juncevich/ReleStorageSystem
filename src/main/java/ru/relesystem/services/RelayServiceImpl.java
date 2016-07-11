package ru.relesystem.services;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.relesystem.entity.Relay;
import ru.relesystem.repository.RelayRepository;

import java.util.List;

@Repository
@Transactional
@Service("relayService")
public class RelayServiceImpl implements RelayService {
    private RelayRepository relayRepository;

    @Override
    @Transactional(readOnly=true)
    public List<Relay> findAll() {
        return Lists.newArrayList(relayRepository.findAll());
    }

    @Override
    @Transactional(readOnly=true)
    public Relay findById(Long id) {
        return relayRepository.findOne(id);
    }

    @Override
    public Relay save(Relay relay) {
        return relayRepository.save(relay);
    }

    @Autowired
    public void setContactRepository(RelayRepository relayRepository) {
        this.relayRepository = relayRepository;
    }

    @Override
    @Transactional(readOnly=true)
    public Page<Relay> findAllByPage(Pageable pageable) {
        return relayRepository.findAll(pageable);
    }

}