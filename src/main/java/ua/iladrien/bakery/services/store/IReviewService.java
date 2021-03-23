package ua.iladrien.bakery.services.store;

import ua.iladrien.bakery.web.models.Review;

public interface IReviewService {
    Review save(Review obj);
    Review findById(int id);
    boolean removeById(int id);
}
