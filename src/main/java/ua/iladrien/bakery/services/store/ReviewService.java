package ua.iladrien.bakery.services.store;

import lombok.RequiredArgsConstructor;
import ua.iladrien.bakery.web.models.Review;

@RequiredArgsConstructor
public class ReviewService implements IReviewService {

    @Override
    public Review save(Review obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Review findById(int id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeById(int id) {
        throw new UnsupportedOperationException();
    }
}
